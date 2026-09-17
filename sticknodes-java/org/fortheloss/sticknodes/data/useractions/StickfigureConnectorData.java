package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureConnectorData implements com.badlogic.gdx.utils.Disposable {
    private java.util.ArrayList<java.lang.Integer> mConnectorEndpoints;
    private java.util.ArrayList<java.lang.Integer> mConnectorIds;

    public StickfigureConnectorData(org.fortheloss.sticknodes.stickfigure.Stickfigure r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r4.mConnectorIds = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r4.mConnectorEndpoints = r0
            boolean r0 = r5.hasConnectors()
            if (r0 == 0) goto L4b
            java.util.ArrayList r5 = r5.getConnectors()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L22:
            if (r0 < 0) goto L4b
            java.lang.Object r1 = r5.get(r0)
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            java.util.ArrayList<java.lang.Integer> r2 = r4.mConnectorIds
            int r3 = r1.getDrawOrderIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.util.ArrayList<java.lang.Integer> r2 = r4.mConnectorEndpoints
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getEndNode()
            int r1 = r1.getDrawOrderIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L22
        L4b:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mConnectorIds = r0
            r1.mConnectorEndpoints = r0
            return
    }

    public java.util.ArrayList<java.lang.Integer> getConnectorEndpoints() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mConnectorEndpoints
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getConnectorIds() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mConnectorIds
            return r0
    }
}
