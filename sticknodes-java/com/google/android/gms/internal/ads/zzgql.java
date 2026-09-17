package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgql {
    private final java.lang.Class zza;
    private java.util.Map zzb;
    private final java.util.List zzc;
    private com.google.android.gms.internal.ads.zzgqn zzd;
    private com.google.android.gms.internal.ads.zzgot zze;

    /* synthetic */ zzgql(java.lang.Class r1, com.google.android.gms.internal.ads.zzgqk r2) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.zzb = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.zzc = r2
            r0.zza = r1
            com.google.android.gms.internal.ads.zzgot r1 = com.google.android.gms.internal.ads.zzgot.zza
            r0.zze = r1
            return
    }

    private final com.google.android.gms.internal.ads.zzgql zze(java.lang.Object r12, com.google.android.gms.internal.ads.zzghd r13, com.google.android.gms.internal.ads.zzgwm r14, boolean r15) throws java.security.GeneralSecurityException {
            r11 = this;
            java.util.Map r0 = r11.zzb
            if (r0 == 0) goto Lb8
            java.lang.String r0 = "`fullPrimitive` must not be null"
            java.util.Objects.requireNonNull(r12, r0)
            int r0 = r14.zzk()
            r1 = 3
            if (r0 != r1) goto Lb0
            com.google.android.gms.internal.ads.zzgqn r0 = new com.google.android.gms.internal.ads.zzgqn
            com.google.android.gms.internal.ads.zzgxf r2 = r14.zzf()
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == r3) goto L3e
            r3 = 2
            if (r2 == r3) goto L31
            if (r2 == r1) goto L2e
            r1 = 4
            if (r2 != r1) goto L26
            goto L31
        L26:
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r13 = "unknown output prefix type"
            r12.<init>(r13)
            throw r12
        L2e:
            byte[] r1 = com.google.android.gms.internal.ads.zzggy.zza
            goto L4a
        L31:
            int r1 = r14.zza()
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgpr.zza(r1)
            byte[] r1 = r1.zzc()
            goto L4a
        L3e:
            int r1 = r14.zza()
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgpr.zzb(r1)
            byte[] r1 = r1.zzc()
        L4a:
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgyx.zzb(r1)
            int r5 = r14.zzk()
            com.google.android.gms.internal.ads.zzgxf r6 = r14.zzf()
            int r7 = r14.zza()
            com.google.android.gms.internal.ads.zzgwb r14 = r14.zzc()
            java.lang.String r8 = r14.zzg()
            r10 = 0
            r2 = r0
            r3 = r12
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.Map r12 = r11.zzb
            java.util.List r13 = r11.zzc
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r0)
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgqn.zzc(r0)
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            java.lang.Object r14 = r12.put(r1, r14)
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L9b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r14)
            r1.add(r0)
            com.google.android.gms.internal.ads.zzgyx r14 = com.google.android.gms.internal.ads.zzgqn.zzc(r0)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r12.put(r14, r1)
        L9b:
            r13.add(r0)
            if (r15 == 0) goto Laf
            com.google.android.gms.internal.ads.zzgqn r12 = r11.zzd
            if (r12 != 0) goto La7
            r11.zzd = r0
            goto Laf
        La7:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "you cannot set two primary primitives"
            r12.<init>(r13)
            throw r12
        Laf:
            return r11
        Lb0:
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r13 = "only ENABLED key is allowed"
            r12.<init>(r13)
            throw r12
        Lb8:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "addEntry cannot be called after build"
            r12.<init>(r13)
            throw r12
    }

    public final com.google.android.gms.internal.ads.zzgql zza(java.lang.Object r2, com.google.android.gms.internal.ads.zzghd r3, com.google.android.gms.internal.ads.zzgwm r4) throws java.security.GeneralSecurityException {
            r1 = this;
            r0 = 0
            r1.zze(r2, r3, r4, r0)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzgql zzb(java.lang.Object r2, com.google.android.gms.internal.ads.zzghd r3, com.google.android.gms.internal.ads.zzgwm r4) throws java.security.GeneralSecurityException {
            r1 = this;
            r0 = 1
            r1.zze(r2, r3, r4, r0)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzgql zzc(com.google.android.gms.internal.ads.zzgot r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            if (r0 == 0) goto L7
            r1.zze = r2
            return r1
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setAnnotations cannot be called after build"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzgqp zzd() throws java.security.GeneralSecurityException {
            r8 = this;
            java.util.Map r1 = r8.zzb
            if (r1 == 0) goto L17
            java.util.List r2 = r8.zzc
            com.google.android.gms.internal.ads.zzgqp r7 = new com.google.android.gms.internal.ads.zzgqp
            com.google.android.gms.internal.ads.zzgqn r3 = r8.zzd
            com.google.android.gms.internal.ads.zzgot r4 = r8.zze
            java.lang.Class r5 = r8.zza
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r8.zzb = r0
            return r7
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "build cannot be called twice"
            r0.<init>(r1)
            throw r0
    }
}
