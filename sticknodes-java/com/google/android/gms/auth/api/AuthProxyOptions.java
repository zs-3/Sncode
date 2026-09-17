package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class AuthProxyOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.auth.api.AuthProxyOptions zza = null;
    private final android.os.Bundle zzb;

    static {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.auth.api.AuthProxyOptions r1 = new com.google.android.gms.auth.api.AuthProxyOptions
            r2 = 0
            r1.<init>(r0, r2)
            com.google.android.gms.auth.api.AuthProxyOptions.zza = r1
            return
    }

    /* synthetic */ AuthProxyOptions(android.os.Bundle r1, com.google.android.gms.auth.api.zzb r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.auth.api.AuthProxyOptions
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.auth.api.AuthProxyOptions r2 = (com.google.android.gms.auth.api.AuthProxyOptions) r2
            android.os.Bundle r0 = r1.zzb
            android.os.Bundle r2 = r2.zzb
            boolean r2 = com.google.android.gms.common.internal.Objects.checkBundlesEquality(r0, r2)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.os.Bundle r1 = r3.zzb
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final android.os.Bundle zza() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r2.zzb
            r0.<init>(r1)
            return r0
    }
}
