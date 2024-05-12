package com.GetThingsDone.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "UserSettings")
@NoArgsConstructor
@AllArgsConstructor
public class UserSettings {

}
