package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzr implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.auth.api.accounttransfer.zzr zza = null;
    private final android.os.Bundle zzb;

    static {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "accountTypes"
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L16
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 0
            r2.<init>(r3)
            r0.putStringArrayList(r1, r2)
        L16:
            com.google.android.gms.auth.api.accounttransfer.zzr r1 = new com.google.android.gms.auth.api.accounttransfer.zzr
            r2 = 0
            r1.<init>(r0, r2)
            com.google.android.gms.auth.api.accounttransfer.zzr.zza = r1
            return
    }

    /* synthetic */ zzr(android.os.Bundle r1, com.google.android.gms.auth.api.accounttransfer.zzq r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.google.android.gms.auth.api.accounttransfer.zzr
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.auth.api.accounttransfer.zzr r7 = (com.google.android.gms.auth.api.accounttransfer.zzr) r7
            android.os.Bundle r1 = r6.zza()
            android.os.Bundle r7 = r7.zza()
            int r3 = r1.size()
            int r4 = r7.size()
            if (r3 == r4) goto L1f
            return r2
        L1f:
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r7.containsKey(r4)
            if (r5 != 0) goto L3a
            return r2
        L3a:
            java.lang.Object r5 = r1.get(r4)
            java.lang.Object r4 = r7.get(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 != 0) goto L27
            return r2
        L49:
            return r0
    }

    public final int hashCode() {
            r7 = this;
            android.os.Bundle r0 = r7.zza()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r2
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r0.keySet()
            r2.<init>(r3)
            java.util.Collections.sort(r2)
            int r3 = r2.size()
            r4 = 0
            r5 = 0
        L20:
            if (r5 >= r3) goto L35
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r1.add(r6)
            java.lang.Object r6 = r0.get(r6)
            r1.add(r6)
            int r5 = r5 + 1
            goto L20
        L35:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r1
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
