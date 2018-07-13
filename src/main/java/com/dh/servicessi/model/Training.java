package com.dh.servicessi.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Training extends ModelBase{
    private String name;
    private Date fecha;
    private String hora;


}
