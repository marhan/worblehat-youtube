package de.codecentric.psd.worblehat.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Borrowing implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NonNull @OneToOne private Book borrowedBook;

  @NonNull private String borrowerEmailAddress;

  @Temporal(TemporalType.DATE)
  @NonNull
  private Date borrowDate;
}
