package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbc implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    private final java.lang.String zba;

    public zbc(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.gms.auth.api.identity.zbc
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.auth.api.identity.zbc> r0 = com.google.android.gms.auth.api.identity.zbc.class
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public final android.os.Bundle zba() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r3.zba
            java.lang.String r2 = "session_id"
            r0.putString(r2, r1)
            return r0
    }

    public final java.lang.String zbb() {
            r1 = this;
            java.lang.String r0 = r1.zba
            return r0
    }
}
