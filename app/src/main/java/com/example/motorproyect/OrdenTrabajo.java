package com.example.motorproyect;

public class OrdenTrabajo {

    private String ordenTrabajo;
    private String propietario;
    private String facturaa;
    private String vehiculo;
    private String placa;
    private String fechaini;
    private String fechafin;
    private boolean expanded;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }


    public OrdenTrabajo(String ordenTrabajo, String propietario, String facturaa, String vehiculo, String placa, String fechaini, String fechafin) {

        this.ordenTrabajo = ordenTrabajo;
        this.propietario = propietario;
        this.facturaa = facturaa;
        this.vehiculo = vehiculo;
        this.placa = placa;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.expanded = false;
    }

    public String getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(String ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFacturaa() {
        return facturaa;
    }

    public void setFacturaa(String facturaa) {
        this.facturaa = facturaa;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String setFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public String toString() {
        return "OrdenTrabajo{" +
                "propietario='" + propietario + '\''+
                ", facturaa='" + facturaa + '\''+
                ", vehiculo='" + vehiculo + '\''+
                ", placa='" + placa + '\''+
                ", fechaini='" + fechaini + '\''+
                ", fechafin='" + fechafin + '\''+
                '}';

    }
}
