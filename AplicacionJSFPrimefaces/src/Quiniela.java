
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

//import com.google.gson.annotations.SerializedName;

public class Quiniela implements Serializable {

	private static final long serialVersionUID = -256614245281017505L;
	
	private List<Lines> lines = new ArrayList<Lines>();
	
	private String date;
	private Integer round;
	private Integer revenue;
	private Integer jackpot;
	private Integer total_bets;
	@SerializedName("15_winners")
	private Integer winners_15;
	@SerializedName("14_winners")
	private Integer winners_14;
	@SerializedName("13_winners")
	private Integer winners_13;
	@SerializedName("12_winners")
	private Integer winners_12;
	@SerializedName("11_winners")
	private Integer winners_11;
	@SerializedName("10_winners")
	private Integer winners_110;
	
	@SerializedName("15_rewards")
	private double rewards_15;
	@SerializedName("14_rewards")
	private double rewards_14;
	@SerializedName("13_rewards")
	private double rewards_13;
	@SerializedName("12_rewards")
	private double rewards_12;
	@SerializedName("11_rewards")
	private double rewards_11;
	@SerializedName("10_rewards")
	private double rewards_10;
	

	public Quiniela() {

	}

	public List<Lines> getLines() {
		return lines;
	}

	public void setLines(List<Lines> lines) {
		this.lines = lines;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getRound() {
		return round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}

	

	public Integer getRevenue() {
		return revenue;
	}

	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}

	public Integer getJackpot() {
		return jackpot;
	}

	public void setJackpot(Integer jackpot) {
		this.jackpot = jackpot;
	}

	public Integer getTotal_bets() {
		return total_bets;
	}

	public void setTotal_bets(Integer total_bets) {
		this.total_bets = total_bets;
	}

	public Integer getWinners_15() {
		return winners_15;
	}

	public void setWinners_15(Integer winners_15) {
		this.winners_15 = winners_15;
	}

	public Integer getWinners_14() {
		return winners_14;
	}

	public void setWinners_14(Integer winners_14) {
		this.winners_14 = winners_14;
	}

	public Integer getWinners_13() {
		return winners_13;
	}

	public void setWinners_13(Integer winners_13) {
		this.winners_13 = winners_13;
	}

	public Integer getWinners_12() {
		return winners_12;
	}

	public void setWinners_12(Integer winners_12) {
		this.winners_12 = winners_12;
	}

	public Integer getWinners_11() {
		return winners_11;
	}

	public void setWinners_11(Integer winners_11) {
		this.winners_11 = winners_11;
	}

	public Integer getWinners_110() {
		return winners_110;
	}

	public void setWinners_110(Integer winners_110) {
		this.winners_110 = winners_110;
	}


	public double getRewards_15() {
		return rewards_15;
	}

	public void setRewards_15(double rewards_15) {
		this.rewards_15 = rewards_15;
	}

	public double getRewards_14() {
		return rewards_14;
	}

	public void setRewards_14(double rewards_14) {
		this.rewards_14 = rewards_14;
	}

	public double getRewards_13() {
		return rewards_13;
	}

	public void setRewards_13(double rewards_13) {
		this.rewards_13 = rewards_13;
	}

	public double getRewards_12() {
		return rewards_12;
	}

	public void setRewards_12(double rewards_12) {
		this.rewards_12 = rewards_12;
	}

	public double getRewards_11() {
		return rewards_11;
	}

	public void setRewards_11(double rewards_11) {
		this.rewards_11 = rewards_11;
	}

	public double getRewards_10() {
		return rewards_10;
	}

	public void setRewards_10(double rewards_10) {
		this.rewards_10 = rewards_10;
	}

	@Override
	public String toString() {
		String cadena = "";
		for (Lines lines : lines) {
			cadena += lines.getBasealias1() + "-" + lines.getBasealias2();
			cadena += ":";
		}

		return cadena;
	}

}
