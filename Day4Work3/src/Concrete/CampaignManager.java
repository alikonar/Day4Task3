package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya guncellendi : " + campaign.getCampaignName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());

	}

}
