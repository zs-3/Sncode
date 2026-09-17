package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbph extends com.google.android.gms.internal.ads.zzbpk {
    public zzbph() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final com.google.android.gms.internal.ads.zzbpo zzb(java.lang.String r5) throws android.os.RemoteException {
            r4 = this;
            java.lang.String r0 = "Could not instantiate mediation adapter: "
            java.lang.Class<com.google.android.gms.internal.ads.zzbph> r1 = com.google.android.gms.internal.ads.zzbph.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L62
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.Throwable -> L62
            java.lang.Class<com.google.android.gms.ads.mediation.MediationAdapter> r3 = com.google.android.gms.ads.mediation.MediationAdapter.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L29
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.mediation.MediationAdapter r1 = (com.google.android.gms.ads.mediation.MediationAdapter) r1     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbqm r2 = new com.google.android.gms.internal.ads.zzbqm     // Catch: java.lang.Throwable -> L62
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L62
            goto L8c
        L29:
            java.lang.Class<com.google.android.gms.ads.mediation.Adapter> r3 = com.google.android.gms.ads.mediation.Adapter.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L45
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.mediation.Adapter r1 = (com.google.android.gms.ads.mediation.Adapter) r1     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbqm r2 = new com.google.android.gms.internal.ads.zzbqm     // Catch: java.lang.Throwable -> L62
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L62
            goto L8c
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            r1.append(r0)     // Catch: java.lang.Throwable -> L62
            r1.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = " (not a valid adapter)."
            r1.append(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)     // Catch: java.lang.Throwable -> L62
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            throw r1     // Catch: java.lang.Throwable -> L62
        L62:
            java.lang.String r1 = "Reflection failed, retrying using direct instantiation"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L7a
            com.google.android.gms.internal.ads.zzbqm r2 = new com.google.android.gms.internal.ads.zzbqm     // Catch: java.lang.Throwable -> L8d
            com.google.ads.mediation.admob.AdMobAdapter r1 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            goto L8c
        L7a:
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto La5
            com.google.android.gms.internal.ads.zzbqm r2 = new com.google.android.gms.internal.ads.zzbqm     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.ads.mediation.customevent.CustomEventAdapter r1 = new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8d
        L8c:
            return r2
        L8d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ". "
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r1)
        La5:
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final com.google.android.gms.internal.ads.zzbrk zzc(java.lang.String r3) throws android.os.RemoteException {
            r2 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzbro> r0 = com.google.android.gms.internal.ads.zzbro.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r3 = (com.google.android.gms.ads.mediation.rtb.RtbAdapter) r3     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzbrx r0 = new com.google.android.gms.internal.ads.zzbrx     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            return r0
        L1f:
            android.os.RemoteException r3 = new android.os.RemoteException
            r3.<init>()
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean zzd(java.lang.String r4) throws android.os.RemoteException {
            r3 = this;
            r0 = 0
            java.lang.Class<com.google.android.gms.internal.ads.zzbph> r1 = com.google.android.gms.internal.ads.zzbph.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = java.lang.Class.forName(r4, r0, r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.google.android.gms.ads.mediation.Adapter> r2 = com.google.android.gms.ads.mediation.Adapter.class
            boolean r4 = r2.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L12
            return r4
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not load custom event implementation class as Adapter: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", assuming old custom event implementation."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean zze(java.lang.String r4) throws android.os.RemoteException {
            r3 = this;
            r0 = 0
            java.lang.Class<com.google.android.gms.internal.ads.zzbph> r1 = com.google.android.gms.internal.ads.zzbph.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = java.lang.Class.forName(r4, r0, r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.google.android.gms.ads.mediation.customevent.CustomEvent> r2 = com.google.android.gms.ads.mediation.customevent.CustomEvent.class
            boolean r4 = r2.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L12
            return r4
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not load custom event implementation class: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", trying Adapter implementation class."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return r0
    }
}
