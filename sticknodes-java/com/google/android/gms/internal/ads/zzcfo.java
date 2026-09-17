package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public interface zzcfo extends com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdga, com.google.android.gms.internal.ads.zzcff, com.google.android.gms.internal.ads.zzbmr, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzbnd, com.google.android.gms.internal.ads.zzayv, com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.ads.internal.zzm, com.google.android.gms.internal.ads.zzchb, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzccj, com.google.android.gms.internal.ads.zzchd {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzccj
    android.content.Context getContext();

    int getHeight();

    android.view.ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] r1);

    int getMeasuredHeight();

    int getMeasuredWidth();

    android.view.ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    void loadDataWithBaseURL(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5);

    void loadUrl(java.lang.String r1);

    void measure(int r1, int r2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzccj
    void setBackgroundColor(int r1);

    void setOnClickListener(android.view.View.OnClickListener r1);

    void setOnTouchListener(android.view.View.OnTouchListener r1);

    void setWebChromeClient(android.webkit.WebChromeClient r1);

    void setWebViewClient(android.webkit.WebViewClient r1);

    @Override // com.google.android.gms.internal.ads.zzccj
    void zzC(com.google.android.gms.internal.ads.zzcgq r1);

    @Override // com.google.android.gms.internal.ads.zzcff
    com.google.android.gms.internal.ads.zzfgh zzD();

    android.content.Context zzE();

    @Override // com.google.android.gms.internal.ads.zzchd
    android.view.View zzF();

    android.webkit.WebView zzG();

    android.webkit.WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzchb
    com.google.android.gms.internal.ads.zzavn zzI();

    com.google.android.gms.internal.ads.zzbai zzJ();

    com.google.android.gms.internal.ads.zzbfq zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    com.google.android.gms.internal.ads.zzchg zzN();

    @Override // com.google.android.gms.internal.ads.zzcha
    com.google.android.gms.internal.ads.zzchi zzO();

    com.google.android.gms.internal.ads.zzegd zzP();

    com.google.android.gms.internal.ads.zzegf zzQ();

    @Override // com.google.android.gms.internal.ads.zzcgr
    com.google.android.gms.internal.ads.zzfgk zzR();

    com.google.android.gms.internal.ads.zzfhg zzS();

    com.google.common.util.concurrent.ListenableFuture zzT();

    java.lang.String zzU();

    java.util.List zzV();

    void zzW(com.google.android.gms.internal.ads.zzfgh r1, com.google.android.gms.internal.ads.zzfgk r2);

    void zzX();

    void zzY();

    void zzZ(int r1);

    void zzaA(java.lang.String r1, com.google.android.gms.common.util.Predicate r2);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean r1, int r2);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean r1);

    void zzad();

    void zzae(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    void zzaf();

    void zzag(java.lang.String r1, com.google.android.gms.internal.ads.zzbjw r2);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm r1);

    void zzaj(com.google.android.gms.internal.ads.zzchi r1);

    void zzak(com.google.android.gms.internal.ads.zzbai r1);

    void zzal(boolean r1);

    void zzam();

    void zzan(android.content.Context r1);

    void zzao(boolean r1);

    void zzap(com.google.android.gms.internal.ads.zzbfo r1);

    void zzaq(boolean r1);

    void zzar(com.google.android.gms.internal.ads.zzbfq r1);

    void zzas(com.google.android.gms.internal.ads.zzegd r1);

    void zzat(com.google.android.gms.internal.ads.zzegf r1);

    void zzau(int r1);

    void zzav(boolean r1);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm r1);

    void zzax(boolean r1);

    void zzay(boolean r1);

    void zzaz(java.lang.String r1, com.google.android.gms.internal.ads.zzbjw r2);

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzccj
    android.app.Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzccj
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzccj
    com.google.android.gms.internal.ads.zzbdi zzm();

    @Override // com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzccj
    com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzccj
    com.google.android.gms.internal.ads.zzcgq zzq();

    @Override // com.google.android.gms.internal.ads.zzccj
    void zzt(java.lang.String r1, com.google.android.gms.internal.ads.zzcdv r2);
}
