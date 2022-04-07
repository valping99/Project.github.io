package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ChiTietDonHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChiTietDonHang.findAll", query = "SELECT c FROM ChiTietDonHang c"),
    @NamedQuery(name = "ChiTietDonHang.findByMaChiTietDh", query = "SELECT c FROM ChiTietDonHang c WHERE c.maChiTietDh = :maChiTietDh"),
    @NamedQuery(name = "ChiTietDonHang.findBySoLuong", query = "SELECT c FROM ChiTietDonHang c WHERE c.soLuong = :soLuong"),
    @NamedQuery(name = "ChiTietDonHang.findByGiaTien", query = "SELECT c FROM ChiTietDonHang c WHERE c.giaTien = :giaTien"),
    @NamedQuery(name = "ChiTietDonHang.findByTrangThai", query = "SELECT c FROM ChiTietDonHang c WHERE c.trangThai = :trangThai")})
public class ChiTietDonHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaChiTietDh")
    private Integer maChiTietDh;
    @Column(name = "SoLuong")
    private Integer soLuong;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GiaTien")
    private Double giaTien;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    @JoinColumn(name = "MaDh", referencedColumnName = "MaDh")
    @ManyToOne
    private DonHang maDh;
    @JoinColumn(name = "MaSp", referencedColumnName = "MaSp")
    @ManyToOne
    private SanPham maSp;
    
    @JoinColumn(name = "MaTTVC", referencedColumnName = "MaTTVC")
    @ManyToOne
    private TrangThaiVanChuyen maTTVC;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(Integer maChiTietDh) {
        this.maChiTietDh = maChiTietDh;
    }

    public Integer getMaChiTietDh() {
        return maChiTietDh;
    }

    public void setMaChiTietDh(Integer maChiTietDh) {
        this.maChiTietDh = maChiTietDh;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public DonHang getMaDh() {
        return maDh;
    }

    public void setMaDh(DonHang maDh) {
        this.maDh = maDh;
    }

    public SanPham getMaSp() {
        return maSp;
    }

    public void setMaSp(SanPham maSp) {
        this.maSp = maSp;
    }
    
    public TrangThaiVanChuyen getMaTTVC() {
        return maTTVC;
    }

    public void setMaTTVC(TrangThaiVanChuyen maTTVC) {
        this.maTTVC = maTTVC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maChiTietDh != null ? maChiTietDh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChiTietDonHang)) {
            return false;
        }
        ChiTietDonHang other = (ChiTietDonHang) object;
        if ((this.maChiTietDh == null && other.maChiTietDh != null) || (this.maChiTietDh != null && !this.maChiTietDh.equals(other.maChiTietDh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ChiTietDonHang[ maChiTietDh=" + maChiTietDh + " ]";
    }

}
