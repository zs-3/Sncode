package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ConnectorProperties extends org.fortheloss.sticknodes.data.useractions.StickNodeProperties {
    public float mNodeLocalX;
    public float mNodeLocalY;
    public int mNodeMethod;
    public float mNodePercent;
    public float mNodePercentDefault;
    public boolean mNodeReversed;
    public float mNodeValue;
    public float mSmartStretchAncestralValue;

    public ConnectorProperties(org.fortheloss.sticknodes.stickfigure.Connector r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mNodeReversed = r0
            r0 = 1
            r1.mNodeMethod = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.mNodePercent = r0
            r1.mNodePercentDefault = r0
            r0 = 1112014848(0x42480000, float:50.0)
            r1.mNodeValue = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mSmartStretchAncestralValue = r0
            r1.getProperties(r2)
            return
    }

    public void getProperties(org.fortheloss.sticknodes.stickfigure.Connector r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
