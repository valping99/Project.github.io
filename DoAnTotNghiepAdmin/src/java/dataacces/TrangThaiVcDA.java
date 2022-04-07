package dataacces;

import entities.ChiTietDonHang;
import entities.TrangThaiVanChuyen;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class TrangThaiVcDA {

    private Session s;

    public TrangThaiVcDA() {
        s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }

    public List<TrangThaiVanChuyen> getAll(Integer maxResult) {
        return s.createCriteria(TrangThaiVanChuyen.class).setMaxResults(maxResult == null ? 1000 : maxResult).list();
    }

    public List<TrangThaiVanChuyen> getProPage1(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from TrangThaiVanChuyen");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 4 : maxResult).list();
    }

    public Long getNumberProductDetail() {
        try {

            List list = s.createQuery("from TrangThaiVanChuyen").list();
            s.getTransaction().commit();
            s.close();
            return (long) list.size();
        } catch (Exception e) {
            s.getTransaction().rollback();
            s.close();
        }
        return 0L;
    }

    public TrangThaiVanChuyen getById(int maTTVC) {
        TrangThaiVanChuyen tts = (TrangThaiVanChuyen) s.load(TrangThaiVanChuyen.class, maTTVC);
        s.getTransaction().commit();
        return tts;
    }

    public List<TrangThaiVanChuyen> search(String tenTTVC)
    {
        Query q=s.createQuery("select vc from TrangThaiVanChuyen vc where vc.tenTTVC like :tenTTVC");
        q.setParameter("tenTTVC", "%"+ tenTTVC+"%");
        return q.list();
    }
    
    public List<ChiTietDonHang> search1(String tenTTVC)
    {
        Query q=s.createQuery("select tt from TrangThaiVanChuyen tt join ChiTietDonHang c on c.maTTVC = tt.maTTVC where tt.tenTTVC = :tenTTVC");
        q.setParameter("tenTTVC", "%"+ tenTTVC+"%");
        return q.list();
    }
}
