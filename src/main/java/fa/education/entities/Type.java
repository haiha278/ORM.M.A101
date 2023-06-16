package fa.education.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Type")
public class Type {
    @Id
    @Column(name = "TYPE_ID")
    private int typeId;
    @Column(name = "TYPE_NAME", nullable = false, unique = true)
    private String typeName;
    @Column(name = "TYPE_DESCRIPTION", nullable = false)
    private String typeDescription;
    @OneToMany(mappedBy = "type")
    private List<MovieType> movieTypes;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }
}
