package in.vote.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vote.app.entities.Candidate;
import in.vote.app.repositories.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository canRepo;

	public Candidate getCandidateByCandidate(String candidate) {
		
		return this.canRepo.getCandidateByCandidate(candidate);
	}

	public Candidate addCandidate(Candidate can) {
		// TODO Auto-generated method stub
		return this.canRepo.save(can);
	}

}
