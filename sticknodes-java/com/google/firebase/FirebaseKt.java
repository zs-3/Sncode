package com.google.firebase;

/* compiled from: Firebase.kt */
/* loaded from: classes2.dex */
public final class FirebaseKt {
    public static final com.google.firebase.FirebaseApp getApp(com.google.firebase.Firebase r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.google.firebase.FirebaseApp r1 = com.google.firebase.FirebaseApp.getInstance()
            java.lang.String r0 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
