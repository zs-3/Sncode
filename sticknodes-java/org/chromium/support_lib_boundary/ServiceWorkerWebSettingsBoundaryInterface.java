package org.chromium.support_lib_boundary;

/* loaded from: classes2.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean r1);

    void setAllowFileAccess(boolean r1);

    void setBlockNetworkLoads(boolean r1);

    void setCacheMode(int r1);

    void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> r1);
}
