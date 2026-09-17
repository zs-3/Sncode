package com.google.android.gms.ads;

import com.google.android.gms.ads.AbstractAdRequestBuilder;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class AbstractAdRequestBuilder<T extends com.google.android.gms.ads.AbstractAdRequestBuilder<T>> {
    protected final com.google.android.gms.ads.internal.client.zzeh zza;

    protected AbstractAdRequestBuilder() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.ads.internal.client.zzeh r0 = new com.google.android.gms.ads.internal.client.zzeh
            r0.<init>()
            r2.zza = r0
            java.lang.String r1 = "B3EEABB8EE11C2BE770B684D95219ECB"
            r0.zzt(r1)
            return
    }

    @java.lang.Deprecated
    public T addCustomEventExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.customevent.CustomEvent> r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzo(r2, r3)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    public T addCustomTargeting(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L27
            java.lang.String r0 = ","
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L27:
            com.google.android.gms.ads.internal.client.zzeh r0 = r2.zza
            r0.zzp(r3, r4)
            com.google.android.gms.ads.AbstractAdRequestBuilder r3 = r2.self()
            return r3
    }

    public T addCustomTargeting(java.lang.String r5, java.util.List<java.lang.String> r6) {
            r4 = this;
            if (r6 == 0) goto L43
            java.util.Iterator r0 = r6.iterator()
        L6:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = ","
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L6
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Value "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            goto L6
        L3a:
            com.google.android.gms.ads.internal.client.zzeh r0 = r4.zza
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)
            r0.zzp(r5, r6)
        L43:
            com.google.android.gms.ads.AbstractAdRequestBuilder r5 = r4.self()
            return r5
    }

    public T addKeyword(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzq(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    public T addNetworkExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.MediationExtrasReceiver> r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzr(r2, r3)
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1c
            java.lang.String r2 = "_emulatorLiveAds"
            boolean r2 = r3.getBoolean(r2)
            if (r2 == 0) goto L1c
            com.google.android.gms.ads.internal.client.zzeh r2 = r1.zza
            java.lang.String r3 = "B3EEABB8EE11C2BE770B684D95219ECB"
            r2.zzu(r3)
        L1c:
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    protected abstract T self();

    public T setAdString(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzv(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    public T setContentUrl(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "Content URL must be non-null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "Content URL must be non-empty."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7, r0)
            int r0 = r7.length()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 512(0x200, float:7.175E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            int r3 = r7.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r1[r5] = r3
            if (r0 > r2) goto L28
            r4 = 1
        L28:
            java.lang.String r0 = "Content URL must not exceed %d in length.  Provided length was %d."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r0, r1)
            com.google.android.gms.ads.internal.client.zzeh r0 = r6.zza
            r0.zzw(r7)
            com.google.android.gms.ads.AbstractAdRequestBuilder r7 = r6.self()
            return r7
    }

    public T setHttpTimeoutMillis(int r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzx(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    public T setNeighboringContentUrls(java.util.List<java.lang.String> r2) {
            r1 = this;
            if (r2 != 0) goto Lc
            java.lang.String r2 = "neighboring content URLs list should not be null"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
        Lc:
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzz(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    public T setRequestAgent(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzC(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzt(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzb(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzy(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzc(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzA(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzd(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
            r0.zzD(r2)
            com.google.android.gms.ads.AbstractAdRequestBuilder r2 = r1.self()
            return r2
    }
}
