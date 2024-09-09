package ma.youcode.transport.service.implementations;

import java.util.List;

import ma.youcode.transport.entity.Partner;
import ma.youcode.transport.repository.PartnerRepository;
import ma.youcode.transport.repository.implementations.PartnerRepositoryImp;
import ma.youcode.transport.service.PartenerService;

import java.sql.SQLException;

public class PartnersServiceImp implements PartenerService {
    private PartnerRepository repository;

    public PartnersServiceImp() {
        repository = new PartnerRepositoryImp();
    }

    @Override
    public Partner addPartner(Partner partner) {
        Partner newPartner =  repository.save(partner);
        return  newPartner;
    }

    @Override
    public Partner updatePartner(Partner partner) {

        Partner updatedPartner = repository.update(partner);
        if (updatedPartner != null) {
            return updatedPartner;
        }else {
            return null;
        }
    }
    
    public Partner getPartner(String partnerId) {
        Partner partner = null;
        if (partnerId != null) {
            partner = repository.findPartnerById(partnerId);
        }
        return partner;
    }

    @Override
    public List<Partner> getAllPartners() {
            List<Partner> partners = repository.findAllPartners();

            if (partners.size() > 0) {
                return partners;
            }else {
                return null;
            }
    }

    @Override
    public Partner  deletePartner(String partnerId)  {
        
        Partner partner = null;
        if (!partnerId.isEmpty()) {
            partner = repository.findPartnerById(partnerId);
        }
        if (partner != null) {
            this.repository.delete(partner);
        }
        return partner;

    }
}
