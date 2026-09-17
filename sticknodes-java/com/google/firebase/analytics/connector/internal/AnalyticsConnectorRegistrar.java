package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
@androidx.annotation.Keep
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public AnalyticsConnectorRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector lambda$getComponents$0(com.google.firebase.components.ComponentContainer r3) {
            java.lang.Class<com.google.firebase.FirebaseApp> r0 = com.google.firebase.FirebaseApp.class
            java.lang.Object r0 = r3.get(r0)
            com.google.firebase.FirebaseApp r0 = (com.google.firebase.FirebaseApp) r0
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r3.get(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.google.firebase.events.Subscriber> r2 = com.google.firebase.events.Subscriber.class
            java.lang.Object r3 = r3.get(r2)
            com.google.firebase.events.Subscriber r3 = (com.google.firebase.events.Subscriber) r3
            com.google.firebase.analytics.connector.AnalyticsConnector r3 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.getInstance(r0, r1, r3)
            return r3
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.SuppressLint({"MissingPermission"})
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r3 = this;
            java.lang.Class<com.google.firebase.FirebaseApp> r0 = com.google.firebase.FirebaseApp.class
            java.lang.Class<com.google.firebase.analytics.connector.AnalyticsConnector> r1 = com.google.firebase.analytics.connector.AnalyticsConnector.class
            r2 = 2
            com.google.firebase.components.Component[] r2 = new com.google.firebase.components.Component[r2]
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            com.google.firebase.components.Dependency r0 = com.google.firebase.components.Dependency.required(r0)
            com.google.firebase.components.Component$Builder r0 = r1.add(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            java.lang.Class<com.google.firebase.events.Subscriber> r1 = com.google.firebase.events.Subscriber.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.firebase.analytics.connector.internal.zzb r1 = new com.google.firebase.analytics.connector.internal.zzb
            r1.<init>()
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            com.google.firebase.components.Component$Builder r0 = r0.eagerInDefaultApp()
            com.google.firebase.components.Component r0 = r0.build()
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "fire-analytics"
            java.lang.String r1 = "22.4.0"
            com.google.firebase.components.Component r0 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r0, r1)
            r1 = 1
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            return r0
    }
}
