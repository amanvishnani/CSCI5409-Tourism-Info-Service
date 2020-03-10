package dal.cloud.tourism.InformationService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dal.cloud.tourism.InformationService.model.TouristLocation;

@Repository
public interface TouristLocationRepository extends JpaRepository<TouristLocation, Integer> {
	
	@Query(value = "SELECT t.* FROM TouristLocation t "
			+ "JOIN City c on t.city_Id = c.city_Id "
			+ "where c.province = :province", nativeQuery = true) 
	public List<TouristLocation> getLocationsByProvince(String province);
	
	@Query(value = "SELECT t.* FROM TouristLocation t "
			+ "where t.city_Id = :cityId", nativeQuery = true) 
	public List<TouristLocation> getLocationsByCityId(int cityId);

}
