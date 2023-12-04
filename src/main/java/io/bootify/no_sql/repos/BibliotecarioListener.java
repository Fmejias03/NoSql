package io.bootify.no_sql.repos;

import io.bootify.no_sql.domain.Bibliotecario;
import io.bootify.no_sql.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class BibliotecarioListener extends AbstractMongoEventListener<Bibliotecario> {

    private final PrimarySequenceService primarySequenceService;

    public BibliotecarioListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Bibliotecario> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }

}
