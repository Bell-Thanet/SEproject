package com.cpe.backend.registeruser.entity;
import lombok.*;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Collection;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//สร้างไว้เทจ ของจริงดึงเพื่อน
@Data
@Entity
@NoArgsConstructor
@Table(name="Member")
public class Member {
	@Id
	@SequenceGenerator(name="Member_seq",sequenceName="Member_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Member_seq")
	private @NonNull Long id;
	private @NonNull String member_id;
	private @NonNull String name;
	private @NonNull String address;
	private @NonNull String email;
	private @NonNull String phonenumber;

	@OneToMany(fetch = FetchType.EAGER)
	//mappedBy  = "member"
	private Collection<Return> member;

	public void setName(long name) {
		this.id = name;
	}

}