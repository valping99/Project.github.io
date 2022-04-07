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
@Table(name = "Roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roles.findAll", query = "SELECT rl FROM Roles rl"),
    @NamedQuery(name = "Roles.findByIdRole", query = "SELECT rl FROM Roles rl WHERE rl.idRole = :idRole"),
    @NamedQuery(name = "Roles.findByNameRole", query = "SELECT rl FROM Roles rl WHERE rl.nameRole = :nameRole")})
public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRole")
    private Integer idRole;
    
    @Column(name = "NameRole")
    private String nameRole;
    
    @OneToMany(mappedBy = "idRole")
    private Collection<QuanTri> QuanTriCollection;
    
    public Roles() {
    }

    public Roles(Integer idRole) {
        this.idRole = idRole;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    @XmlTransient
    public Collection<QuanTri> getQuanTriCollection() {
        return QuanTriCollection;
    }

    public void setQuanTriCollection(Collection<QuanTri> QuanTriCollection) {
        this.QuanTriCollection = QuanTriCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRole != null ? idRole.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.idRole == null && other.idRole != null) || (this.idRole != null && !this.idRole.equals(other.idRole))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "entities.Roles[ idRole=" + idRole + " ]";
    }
    
   
}
