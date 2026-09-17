package com.google.firebase.ktx;

/* compiled from: Logging.kt */
@androidx.annotation.Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public FirebaseCommonLegacyRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r2 = this;
            java.lang.String r0 = "fire-core-ktx"
            java.lang.String r1 = "21.0.0"
            com.google.firebase.components.Component r0 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r0, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }
}
