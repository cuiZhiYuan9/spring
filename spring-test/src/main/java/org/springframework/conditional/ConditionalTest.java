package org.springframework.conditional;

import org.springframework.conditional.condition.TestCon;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(TestCon.class)
@Component
public class ConditionalTest {
}
