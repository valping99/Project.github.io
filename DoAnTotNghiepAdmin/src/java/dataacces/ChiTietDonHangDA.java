package dataacces;

import entities.ChiTietDonHang;
import entities.TrangThaiVanChuyen;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ChiTietDonHangDA {
     private Session s;
      public ChiTietDonHangDA() {
        s= NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }
      
     public List<ChiTietDonHang>getAll(Integer maxResult){
              return s.createCriteria(ChiTietDonHang.class).setMaxResults(maxResult == null ? 1000 : maxResult).list();
    }

    public List<ChiTietDonHang> getProPage1(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from ChiTietDonHang where trangThai = 1");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 4 : maxResult).list();
    }

    public Long getNumberProductDetail() {
        try {

            List list = s.createQuery("from ChiTietDonHang where trangThai = 1").list();
            s.getTransaction().commit();
            s.close();
            return (long) list.size();
        } catch (Exception e) {
            s.getTransaction().rollback();
            s.close();
        }
        return 0L;
    }
    
    public void update(ChiTietDonHang ctdh){
        s.merge(ctdh);
        s.getTransaction().commit();
    }
    
    public ChiTietDonHang getById(int maChiTietDh)
    {
        ChiTietDonHang ctdh = (ChiTietDonHang) s.load(ChiTietDonHang.class, maChiTietDh);
        s.getTransaction().commit();
        return ctdh;
    }
    
    // Trang Thai
    
    public List<TrangThaiVanChuyen> getProPage2(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from TrangThaiVanChuyen");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 4 : maxResult).list();
    }
}
