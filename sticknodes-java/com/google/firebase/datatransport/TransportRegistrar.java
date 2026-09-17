package com.google.firebase.datatransport;

@androidx.annotation.Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ com.google.android.datatransport.TransportFactory $r8$lambda$AeGq9PbnRmFkIlbEm4gOj_nxv3Y(com.google.firebase.components.ComponentContainer r0) {
            com.google.android.datatransport.TransportFactory r0 = lambda$getComponents$2(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.TransportFactory $r8$lambda$cPZPPfWZLxVwhtSgzJNU9TpSidE(com.google.firebase.components.ComponentContainer r0) {
            com.google.android.datatransport.TransportFactory r0 = lambda$getComponents$0(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.TransportFactory $r8$lambda$mPHsLLb3xSURGe7x7ESTjNkE14I(com.google.firebase.components.ComponentContainer r0) {
            com.google.android.datatransport.TransportFactory r0 = lambda$getComponents$1(r0)
            return r0
    }

    public TransportRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$0(com.google.firebase.components.ComponentContainer r1) {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r1 = r1.get(r0)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r1)
            com.google.android.datatransport.runtime.TransportRuntime r1 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.cct.CCTDestination r0 = com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE
            com.google.android.datatransport.TransportFactory r1 = r1.newFactory(r0)
            return r1
    }

    private static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$1(com.google.firebase.components.ComponentContainer r1) {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r1 = r1.get(r0)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r1)
            com.google.android.datatransport.runtime.TransportRuntime r1 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.cct.CCTDestination r0 = com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE
            com.google.android.datatransport.TransportFactory r1 = r1.newFactory(r0)
            return r1
    }

    private static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$2(com.google.firebase.components.ComponentContainer r1) {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r1 = r1.get(r0)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r1)
            com.google.android.datatransport.runtime.TransportRuntime r1 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.cct.CCTDestination r0 = com.google.android.datatransport.cct.CCTDestination.INSTANCE
            com.google.android.datatransport.TransportFactory r1 = r1.newFactory(r0)
            return r1
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r5 = this;
            java.lang.Class<com.google.android.datatransport.TransportFactory> r0 = com.google.android.datatransport.TransportFactory.class
            r1 = 4
            com.google.firebase.components.Component[] r1 = new com.google.firebase.components.Component[r1]
            com.google.firebase.components.Component$Builder r2 = com.google.firebase.components.Component.builder(r0)
            java.lang.String r3 = "fire-transport"
            com.google.firebase.components.Component$Builder r2 = r2.name(r3)
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r2 = r2.add(r4)
            com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda1 r4 = com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.components.Component$Builder r2 = r2.factory(r4)
            com.google.firebase.components.Component r2 = r2.build()
            r4 = 0
            r1[r4] = r2
            java.lang.Class<com.google.firebase.datatransport.LegacyTransportBackend> r2 = com.google.firebase.datatransport.LegacyTransportBackend.class
            com.google.firebase.components.Qualified r2 = com.google.firebase.components.Qualified.qualified(r2, r0)
            com.google.firebase.components.Component$Builder r2 = com.google.firebase.components.Component.builder(r2)
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r2 = r2.add(r4)
            com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda2 r4 = com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda2.INSTANCE
            com.google.firebase.components.Component$Builder r2 = r2.factory(r4)
            com.google.firebase.components.Component r2 = r2.build()
            r4 = 1
            r1[r4] = r2
            java.lang.Class<com.google.firebase.datatransport.TransportBackend> r2 = com.google.firebase.datatransport.TransportBackend.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.qualified(r2, r0)
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.required(r2)
            com.google.firebase.components.Component$Builder r0 = r0.add(r2)
            com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda0 r2 = com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.components.Component$Builder r0 = r0.factory(r2)
            com.google.firebase.components.Component r0 = r0.build()
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "19.0.0"
            com.google.firebase.components.Component r0 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r3, r0)
            r2 = 3
            r1[r2] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            return r0
    }
}
