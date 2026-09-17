package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.ApiOptions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class ApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final int zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final com.google.android.gms.common.api.Api.ApiOptions zac;
    private final java.lang.String zad;

    private ApiKey(com.google.android.gms.common.api.Api r3, com.google.android.gms.common.api.Api.ApiOptions r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.zab = r3
            r2.zac = r4
            r2.zad = r5
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            r2.zaa = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.internal.ApiKey<O> getSharedApiKey(com.google.android.gms.common.api.Api<O> r1, O r2, java.lang.String r3) {
            com.google.android.gms.common.api.internal.ApiKey r0 = new com.google.android.gms.common.api.internal.ApiKey
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.api.internal.ApiKey
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.common.api.internal.ApiKey r5 = (com.google.android.gms.common.api.internal.ApiKey) r5
            com.google.android.gms.common.api.Api r2 = r4.zab
            com.google.android.gms.common.api.Api r3 = r5.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2e
            com.google.android.gms.common.api.Api$ApiOptions r2 = r4.zac
            com.google.android.gms.common.api.Api$ApiOptions r3 = r5.zac
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2e
            java.lang.String r2 = r4.zad
            java.lang.String r5 = r5.zad
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r2, r5)
            if (r5 == 0) goto L2e
            return r1
        L2e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    public final java.lang.String zaa() {
            r1 = this;
            com.google.android.gms.common.api.Api r0 = r1.zab
            java.lang.String r0 = r0.zad()
            return r0
    }
}
