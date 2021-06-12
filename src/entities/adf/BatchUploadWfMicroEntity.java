package entities.adf;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

/**
 * @Author Alsapagh
 * @Date 6/12/2021
 */

@Entity
@Table(name = "BATCH_UPLOAD_WF_MICRO", schema = "BPLUS_GL", catalog = "")
public class BatchUploadWfMicroEntity {
    private Long usrno;
    private Long oprno;
    private Time busdate;
    private String idno;
    private String status;
    private String notes;

    @Basic
    @Column(name = "USRNO")
    public Long getUsrno() {
        return usrno;
    }

    public void setUsrno(Long usrno) {
        this.usrno = usrno;
    }

    @Basic
    @Column(name = "OPRNO")
    public Long getOprno() {
        return oprno;
    }

    public void setOprno(Long oprno) {
        this.oprno = oprno;
    }

    @Basic
    @Column(name = "BUSDATE")
    public Time getBusdate() {
        return busdate;
    }

    public void setBusdate(Time busdate) {
        this.busdate = busdate;
    }

    @Id
    @Column(name = "IDNO")
    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "NOTES")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchUploadWfMicroEntity that = (BatchUploadWfMicroEntity) o;
        return Objects.equals(usrno, that.usrno) &&
                Objects.equals(oprno, that.oprno) &&
                Objects.equals(busdate, that.busdate) &&
                Objects.equals(idno, that.idno) &&
                Objects.equals(status, that.status) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usrno, oprno, busdate, idno, status, notes);
    }
}
