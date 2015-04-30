package com.weatherreport.vo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class WeatherByCityName {
	@JsonProperty("coord")
	private Coord coord;
	@JsonProperty("sys")
	private Sys sys;
	@JsonProperty("weather")
	private List<Weather> weather;
	@JsonProperty("base")
	private String base;
	@JsonProperty("main")
	private Main main;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("clouds")
	private Clouds clouds;
	@JsonProperty("dt")
	private String dt;
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private String cod;

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "WeatherByCityName [coord=" + coord + ", sys=" + sys
				+ ", weather=" + weather + ", base=" + base + ", main=" + main
				+ ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt
				+ ", id=" + id + ", name=" + name + ", cod=" + cod
				+ ", getCoord()=" + getCoord() + ", getSys()=" + getSys()
				+ ", getWeather()=" + getWeather() + ", getBase()=" + getBase()
				+ ", getMain()=" + getMain() + ", getWind()=" + getWind()
				+ ", getClouds()=" + getClouds() + ", getDt()=" + getDt()
				+ ", getId()=" + getId() + ", getCod()=" + getCod()
				+ ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
