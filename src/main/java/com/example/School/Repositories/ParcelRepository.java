package com.example.School.Repositories;
import com.example.School.Entities.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ParcelRepository extends JpaRepository<Parcel, Integer> {
    List<Parcel> findByParcelId(Integer parcelId);

}
