package org.springframework.scan.cc;

import org.springframework.conditional.ConditionalTest;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionalTest.class)
public class ComScanTest {
}
