package br.com.cod3r.chain.process.service;

import br.com.cod3r.chain.process.steps.ProcessStep;
import br.com.cod3r.chain.process.steps.SaveUser;
import br.com.cod3r.chain.process.steps.ValidateMandatoryField;

public class ServicesCatalog {

	public static ProcessStep saveUserProcess = buildChain(
			new ValidateMandatoryField("name"),
			new ValidateMandatoryField("email"),
			new ValidateMandatoryField("password"),
	new SaveUser());

	private static ProcessStep buildChain(ProcessStep... steps) {
		for (int i = 0; i < steps.length - 1; i++) {
			ProcessStep currentStep = steps[i];
			currentStep.setNextStep(steps[i + 1]);
		}
		return steps[0];
	}
}
