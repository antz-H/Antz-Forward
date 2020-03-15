package com.antz.domain.core;


import org.hibernate.annotations.Immutable;

import java.util.Random;

/**
 * @author antz
 * @description
 * @date 2019/11/11
 */
@Immutable
public class RuleRandomIdentity implements Identity<String>, RandomIdentity<String> {

    private static final long serialVersionUID = -7208444699929668717L;
    private String value;

    private String prefix;

    private int seed;

    private String joiner;

    private static final int DEFAULT_SEED = 100_000;

    private static final String DEFAULT_JOINER = "_";

    public RuleRandomIdentity() {
        this("", DEFAULT_SEED, DEFAULT_JOINER);
    }

    public RuleRandomIdentity(int seed) {
        this("", seed, DEFAULT_JOINER);
    }


    public RuleRandomIdentity(String prefix, int seed) {
        this(prefix, seed, DEFAULT_JOINER);
    }

    public RuleRandomIdentity(String prefix, int seed, String joiner) {
        this.prefix = prefix;
        this.seed = seed;
        this.joiner = joiner;
        this.value = compose(prefix, seed, joiner);
    }

    @Override
    public final String value() {
        return this.value;
    }

    @Override
    public final String next() {
        return compose(prefix, seed, joiner);
    }

    private String compose(String prefix, int seed, String joiner) {
        long suffix = new Random(seed).nextLong();
        return String.format("%s%s%s", prefix, joiner, suffix);
    }

}
