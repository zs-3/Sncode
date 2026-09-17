package com.google.firebase.tracing;

/* loaded from: classes2.dex */
public class ComponentMonitor implements com.google.firebase.components.ComponentRegistrarProcessor {
    public static /* synthetic */ java.lang.Object $r8$lambda$nUgWIWAyyZxi6mRt6KSZMmA5LxE(java.lang.String r0, com.google.firebase.components.Component r1, com.google.firebase.components.ComponentContainer r2) {
            java.lang.Object r0 = lambda$processRegistrar$0(r0, r1, r2)
            return r0
    }

    public ComponentMonitor() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ java.lang.Object lambda$processRegistrar$0(java.lang.String r0, com.google.firebase.components.Component r1, com.google.firebase.components.ComponentContainer r2) {
            com.google.firebase.tracing.FirebaseTrace.pushTrace(r0)     // Catch: java.lang.Throwable -> Lf
            com.google.firebase.components.ComponentFactory r0 = r1.getFactory()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.create(r2)     // Catch: java.lang.Throwable -> Lf
            com.google.firebase.tracing.FirebaseTrace.popTrace()
            return r0
        Lf:
            r0 = move-exception
            com.google.firebase.tracing.FirebaseTrace.popTrace()
            throw r0
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public java.util.List<com.google.firebase.components.Component<?>> processRegistrar(com.google.firebase.components.ComponentRegistrar r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = r5.getComponents()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r5.next()
            com.google.firebase.components.Component r1 = (com.google.firebase.components.Component) r1
            java.lang.String r2 = r1.getName()
            if (r2 == 0) goto L28
            com.google.firebase.tracing.ComponentMonitor$$ExternalSyntheticLambda0 r3 = new com.google.firebase.tracing.ComponentMonitor$$ExternalSyntheticLambda0
            r3.<init>(r2, r1)
            com.google.firebase.components.Component r1 = r1.withFactory(r3)
        L28:
            r0.add(r1)
            goto Ld
        L2c:
            return r0
    }
}
