package miu.edu.jpa.service;

import lombok.RequiredArgsConstructor;
import miu.edu.jpa.dto.AddressDTO;
import miu.edu.jpa.model.Address;
import miu.edu.jpa.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository repository;
    static ModelMapper mapper = new ModelMapper();
    private static final Function<Address, AddressDTO> toDTO = item -> mapper.map(item, AddressDTO.class);
    private static final Function<AddressDTO, Address> toEntity = item -> mapper.map(item, Address.class);

    public List<AddressDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(toDTO)
                .collect(Collectors.toList());
    }

    public Optional<AddressDTO> findOne(Long id) {
        return repository.findById(id)
                .map(toDTO);
    }

    public AddressDTO save(AddressDTO product) {
        return toDTO.apply(toEntity.apply(product));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
