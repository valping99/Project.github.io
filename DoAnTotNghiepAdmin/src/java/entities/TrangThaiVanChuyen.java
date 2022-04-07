package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luanb
 */
@Entity
@Table(name = "TrangThaiVanChuyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrangThaiVanChuyen.findAll", query = "SELECT tt FROM TrangThaiVanChuyen tt"),
    @NamedQuery(name = "TrangThaiVanChuyen.findByMaTTVC", query = "SELECT tt FROM TrangThaiVanChuyen tt WHERE tt.maTTVC = :maTTVC"),
    @NamedQuery(name = "TrangThaiVanChuyen.findByTenTTVC", query = "SELECT tt FROM TrangThaiVanChuyen tt WHERE tt.tenTTVC = :tenTTVC")})
public class TrangThaiVanChuyen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaTTVC")
    private Integer maTTVC;
    
    @Column(name = "TenTTVC")
    private String tenTTVC;
    
    @OneToMany(mappedBy = "maTTVC")
    private Collection<ChiTietDonHang> chiTietDonHangCollection;
    
    public TrangThaiVanChuyen() {
    }

    public TrangThaiVanChuyen(Integer maTTVC) {
        this.maTTVC = maTTVC;
    }
    
    public Integer getMaTTVC() {
        return maTTVC;
    }

    public void setMaTTVC(Integer maTTVC) {
        this.maTTVC = maTTVC;
    }

    public String getTenTTVC() {
        return tenTTVC;
    }

    public void setTenTTVC(String tenTTVC) {
        this.tenTTVC = tenTTVC;
    }

    @XmlTransient
    public Collection<ChiTietDonHang> getChiTietDonHangCollection() {
        return chiTietDonHangCollection;
    }

    public void setChiTietDonHangCollection(Collection<ChiTietDonHang> chiTietDonHangCollection) {
        this.chiTietDonHangCollection = chiTietDonHangCollection;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTTVC != null ? maTTVC.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrangThaiVanChuyen)) {
            return false;
        }
        TrangThaiVanChuyen other = (TrangThaiVanChuyen) object;
        if ((this.maTTVC == null && other.maTTVC != null) || (this.maTTVC != null && !this.maTTVC.equals(other.maTTVC))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "entities.TrangThaiVanChuyen[ maTTVC=" + maTTVC + " ]";
    }
}
