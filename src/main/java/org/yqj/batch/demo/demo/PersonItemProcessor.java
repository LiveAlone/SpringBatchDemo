package org.yqj.batch.demo.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import org.yqj.batch.demo.bean.Person;

/**
 * @author yaoqijun on 2018-01-08.
 */
@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person>{
    @Override
    public Person process(Person person){
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
        final Person transformedPerson = new Person(firstName, lastName);
        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
