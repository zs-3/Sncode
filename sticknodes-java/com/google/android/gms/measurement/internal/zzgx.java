package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgx {
    protected static final java.util.concurrent.atomic.AtomicReference zza = null;
    protected static final java.util.concurrent.atomic.AtomicReference zzb = null;
    protected static final java.util.concurrent.atomic.AtomicReference zzc = null;
    private final com.google.android.gms.measurement.internal.zzgw zzd;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.measurement.internal.zzgx.zza = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.measurement.internal.zzgx.zzb = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.measurement.internal.zzgx.zzc = r0
            return
    }

    public zzgx(com.google.android.gms.measurement.internal.zzgw r1) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            return
    }

    private static final java.lang.String zzg(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5, java.util.concurrent.atomic.AtomicReference r6) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
        L14:
            int r0 = r4.length
            if (r2 >= r0) goto L59
            r0 = r4[r2]
            boolean r0 = java.util.Objects.equals(r3, r0)
            if (r0 == 0) goto L56
            monitor-enter(r6)
            java.lang.Object r3 = r6.get()     // Catch: java.lang.Throwable -> L53
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L2e
            int r3 = r5.length     // Catch: java.lang.Throwable -> L53
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L53
            r6.set(r3)     // Catch: java.lang.Throwable -> L53
        L2e:
            r0 = r3[r2]     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L53
            r0.append(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = "("
            r0.append(r5)     // Catch: java.lang.Throwable -> L53
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L53
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = ")"
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
            r3[r2] = r0     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L53
            return r0
        L53:
            r3 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L53
            throw r3
        L56:
            int r2 = r2 + 1
            goto L14
        L59:
            return r3
    }

    protected final java.lang.String zza(java.lang.Object[] r6) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = "[]"
            return r6
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        L10:
            int r2 = r6.length
            if (r1 >= r2) goto L38
            r2 = r6[r1]
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L20
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r2 = r5.zzb(r2)
            goto L24
        L20:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L24:
            if (r2 == 0) goto L35
            int r3 = r0.length()
            r4 = 1
            if (r3 == r4) goto L32
            java.lang.String r3 = ", "
            r0.append(r3)
        L32:
            r0.append(r2)
        L35:
            int r1 = r1 + 1
            goto L10
        L38:
            java.lang.String r6 = "]"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    protected final java.lang.String zzb(android.os.Bundle r6) {
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            com.google.android.gms.measurement.internal.zzgw r0 = r5.zzd
            boolean r0 = r0.zza()
            if (r0 != 0) goto L11
            java.lang.String r6 = r6.toString()
            return r6
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bundle[{"
            r0.append(r1)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0.length()
            r4 = 8
            if (r3 == r4) goto L3c
            java.lang.String r3 = ", "
            r0.append(r3)
        L3c:
            java.lang.String r3 = r5.zze(r2)
            r0.append(r3)
            java.lang.String r3 = "="
            r0.append(r3)
            java.lang.Object r2 = r6.get(r2)
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L5b
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = r5.zza(r3)
            goto L79
        L5b:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L66
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.String r2 = r5.zza(r2)
            goto L79
        L66:
            boolean r3 = r2 instanceof java.util.ArrayList
            if (r3 == 0) goto L75
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r2 = r5.zza(r2)
            goto L79
        L75:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L79:
            r0.append(r2)
            goto L23
        L7d:
            java.lang.String r6 = "}]"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    protected final java.lang.String zzc(com.google.android.gms.measurement.internal.zzbh r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzgw r0 = r3.zzd
            boolean r1 = r0.zza()
            if (r1 != 0) goto Ld
            java.lang.String r4 = r4.toString()
            return r4
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "origin="
            r1.append(r2)
            java.lang.String r2 = r4.zzc
            r1.append(r2)
            java.lang.String r2 = ",name="
            r1.append(r2)
            java.lang.String r2 = r4.zza
            java.lang.String r2 = r3.zzd(r2)
            r1.append(r2)
            java.lang.String r2 = ",params="
            r1.append(r2)
            com.google.android.gms.measurement.internal.zzbf r4 = r4.zzb
            if (r4 != 0) goto L35
            r4 = 0
            goto L48
        L35:
            boolean r0 = r0.zza()
            if (r0 != 0) goto L40
            java.lang.String r4 = r4.toString()
            goto L48
        L40:
            android.os.Bundle r4 = r4.zzc()
            java.lang.String r4 = r3.zzb(r4)
        L48:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    protected final java.lang.String zzd(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.google.android.gms.measurement.internal.zzgw r0 = r3.zzd
            boolean r0 = r0.zza()
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzjy.zzc
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzjy.zza
            java.util.concurrent.atomic.AtomicReference r2 = com.google.android.gms.measurement.internal.zzgx.zza
            java.lang.String r4 = zzg(r4, r0, r1, r2)
            return r4
    }

    protected final java.lang.String zze(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.google.android.gms.measurement.internal.zzgw r0 = r3.zzd
            boolean r0 = r0.zza()
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzjz.zzb
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzjz.zza
            java.util.concurrent.atomic.AtomicReference r2 = com.google.android.gms.measurement.internal.zzgx.zzb
            java.lang.String r4 = zzg(r4, r0, r1, r2)
            return r4
    }

    protected final java.lang.String zzf(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.google.android.gms.measurement.internal.zzgw r0 = r3.zzd
            boolean r0 = r0.zza()
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.String r0 = "_exp_"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "experiment_id("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L2c:
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzka.zzb
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzka.zza
            java.util.concurrent.atomic.AtomicReference r2 = com.google.android.gms.measurement.internal.zzgx.zzc
            java.lang.String r4 = zzg(r4, r0, r1, r2)
            return r4
    }
}
