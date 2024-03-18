package com.company.autoconfigure.add;

import com.company.add.AddConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({AddConfiguration.class})
public class AddAutoConfiguration {}
