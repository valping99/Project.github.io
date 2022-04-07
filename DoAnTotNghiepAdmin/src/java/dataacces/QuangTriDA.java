package dataacces;

import entities.QuanTri;
import entities.Roles;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class QuangTriDA {
     private Session s;
      public QuangTriDA() {
        s= NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }
    public List<QuanTri>getAll(){
              return s.createCriteria(QuanTri.class).list();
    }
     public void insert(QuanTri qt){
        s.save(qt);
        s.getTransaction().commit();
    }
    
    public void update(QuanTri qt){
        s.merge(qt);
        s.getTransaction().commit();
    }
    
    public void delete(int id)
    {
        QuanTri qt = (QuanTri) s.load(QuanTri.class, id);
        s.delete(qt);
        s.getTransaction().commit();
    }
     public QuanTri getById(int maQt)
    {
        QuanTri qt = (QuanTri) s.load(QuanTri.class, maQt);
        s.getTransaction().commit();
        return qt;
    }
     
    public QuanTri loginQuanTri(String taiKhoan,String matKhau){
        Query q = s.createQuery(" from QuanTri where taiKhoan = :taiKhoan and matKhau = :matKhau");
       q.setString("matKhau", matKhau);
       q.setString("taiKhoan", taiKhoan);
       QuanTri qt = (QuanTri) q.uniqueResult();
       s.getTransaction().commit();
       return qt;
   }
    
       public List<Roles> getProPage1(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from Roles");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 4 : maxResult).list();
    }
}
