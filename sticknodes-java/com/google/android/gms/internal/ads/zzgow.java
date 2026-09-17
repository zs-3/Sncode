package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgow {
    private java.util.ArrayList zza;
    private com.google.android.gms.internal.ads.zzgot zzb;
    private java.lang.Integer zzc;

    public zzgow() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.ads.zzgot r0 = com.google.android.gms.internal.ads.zzgot.zza
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzgow zza(com.google.android.gms.internal.ads.zzghf r9, int r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            java.util.ArrayList r0 = r8.zza
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzgoy r7 = new com.google.android.gms.internal.ads.zzgoy
            r6 = 0
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.add(r7)
            return r8
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "addEntry cannot be called after build()"
            r9.<init>(r10)
            throw r9
    }

    public final com.google.android.gms.internal.ads.zzgow zzb(com.google.android.gms.internal.ads.zzgot r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            if (r0 == 0) goto L7
            r1.zzb = r2
            return r1
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setAnnotations cannot be called after build()"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzgow zzc(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.zzc = r2
            return r1
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setPrimaryKeyId cannot be called after build()"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzgpa zzd() throws java.security.GeneralSecurityException {
            r5 = this;
            java.util.ArrayList r0 = r5.zza
            if (r0 == 0) goto L3f
            java.lang.Integer r0 = r5.zzc
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()
            java.util.ArrayList r1 = r5.zza
            int r2 = r1.size()
            r3 = 0
        L13:
            if (r3 >= r2) goto L24
            java.lang.Object r4 = r1.get(r3)
            com.google.android.gms.internal.ads.zzgoy r4 = (com.google.android.gms.internal.ads.zzgoy) r4
            int r4 = r4.zza()
            int r3 = r3 + 1
            if (r4 != r0) goto L13
            goto L2c
        L24:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "primary key ID is not present in entries"
            r0.<init>(r1)
            throw r0
        L2c:
            com.google.android.gms.internal.ads.zzgpa r0 = new com.google.android.gms.internal.ads.zzgpa
            com.google.android.gms.internal.ads.zzgot r1 = r5.zzb
            java.util.ArrayList r2 = r5.zza
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.Integer r3 = r5.zzc
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            r5.zza = r4
            return r0
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot call build() twice"
            r0.<init>(r1)
            throw r0
    }
}
