package wad.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.TreeSet;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Article extends AbstractPersistable<Long> {

    private String name;
    
    private String lead;
    private String text;
    private LocalDateTime publishDate;
    private byte[] picture;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Writer> writers;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Category> categories;
    
    
}
