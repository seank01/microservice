package co.fastcampus.jpaservice.mapper;

import co.fastcampus.jpaservice.dto.EmployeeDTO;
import co.fastcampus.jpaservice.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T04:30:56+0000",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.0.2.jar, environment: Java 11.0.16 (Ubuntu)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setName( dto.getName() );

        return employee;
    }

    @Override
    public EmployeeDTO toDto(Employee entiy) {
        if ( entiy == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setName( entiy.getName() );

        return employeeDTO;
    }

    @Override
    public List<Employee> toEntity(List<EmployeeDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( dtos.size() );
        for ( EmployeeDTO employeeDTO : dtos ) {
            list.add( toEntity( employeeDTO ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDTO> toDto(List<Employee> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( entities.size() );
        for ( Employee employee : entities ) {
            list.add( toDto( employee ) );
        }

        return list;
    }
}
