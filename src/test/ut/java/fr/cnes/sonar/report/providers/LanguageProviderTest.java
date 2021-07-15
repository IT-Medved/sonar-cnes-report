package fr.cnes.sonar.report.providers;

import fr.cnes.sonar.report.CommonTest;
import fr.cnes.sonar.report.exceptions.BadSonarQubeRequestException;
import fr.cnes.sonar.report.exceptions.SonarQubeException;
import fr.cnes.sonar.report.providers.language.*;

import org.junit.Test;

public class LanguageProviderTest extends CommonTest {

    private static final String TOKEN = "token";

    @Test(expected = SonarQubeException.class)
    public void executeFaultyGetLanguages() throws SonarQubeException, BadSonarQubeRequestException {
        LanguageProvider languageProvider = new LanguageProviderStandalone(sonarQubeServer, TOKEN, PROJECT_KEY);
        languageProvider.getLanguages();
    }
}