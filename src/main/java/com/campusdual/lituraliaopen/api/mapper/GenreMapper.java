package com.campusdual.lituraliaopen.api.mapper;

import com.campusdual.lituraliaopen.api.model.dtos.GenreDTO;
import com.campusdual.lituraliaopen.domain.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {BookMapper.class})
public interface GenreMapper {

    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    GenreDTO genreToGenreDTO(Genre genre);

    Genre genreDTOToGenre(GenreDTO genreDto);

    @Mappings({@Mapping(source = "id", target = "genreId")})
    Genre idToGenre(Integer id);

    default Integer genreToId(Genre genre) {
        return genre.getGenreId();
    }

}