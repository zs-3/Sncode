package com.google.firebase.components;

/* loaded from: classes2.dex */
public interface ComponentRegistrarProcessor {
    public static final com.google.firebase.components.ComponentRegistrarProcessor NOOP = null;

    static {
            com.google.firebase.components.ComponentRegistrarProcessor$$ExternalSyntheticLambda0 r0 = com.google.firebase.components.ComponentRegistrarProcessor$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.components.ComponentRegistrarProcessor.NOOP = r0
            return
    }

    java.util.List<com.google.firebase.components.Component<?>> processRegistrar(com.google.firebase.components.ComponentRegistrar r1);
}
