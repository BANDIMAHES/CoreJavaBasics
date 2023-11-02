package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users_table",
uniqueConstraints = {
		@UniqueConstraint(columnNames = {"phoneNo"}),
		@UniqueConstraint(columnNames = {"email"})
}
)
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
      private long userId;
}
