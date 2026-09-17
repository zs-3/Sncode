package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class ToolTableScrollPane extends com.badlogic.gdx.scenes.scene2d.ui.ScrollPane implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.scenes.scene2d.ui.Table _table;

    public ToolTableScrollPane(int r4, float r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r3._table = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r2 = 2
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.spaceTop(r4)
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r3._table
            r4.setWidth(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r3._table
            r3.setWidget(r4)
            r4 = 0
            r3.setScrollingDisabled(r0, r4)
            r3.setOverscroll(r4, r4)
            r3.setClamp(r0)
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.setFlingTime(r4)
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell add(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            return r2
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.clear()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._table
            if (r0 == 0) goto Ld
            r0.clear()
            r0 = 0
            r1._table = r0
        Ld:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getWidgetWithId(int r6) {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5._table
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L24
            java.lang.Object r4 = r0.get(r3)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
            if (r4 == 0) goto L1e
            java.lang.Object r2 = r0.get(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r2
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getWidgetWithId(r6)
        L1e:
            if (r2 == 0) goto L21
            goto L24
        L21:
            int r3 = r3 + 1
            goto La
        L24:
            return r2
    }

    public void jumpToNextSubmenu(int r10) {
            r9 = this;
            float r0 = r9.getScrollY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r9._table
            float r1 = r1.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._table
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r3 = r2.size
            r4 = 0
            r5 = 1
            r6 = 0
            if (r10 <= 0) goto L4c
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 != 0) goto L21
            float r10 = r9.getMaxY()
            goto L8b
        L21:
            int r3 = r3 - r5
        L22:
            if (r3 < 0) goto L44
            java.lang.Object r10 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r10 = (com.badlogic.gdx.scenes.scene2d.Actor) r10
            float r10 = r10.getY()
            float r10 = r1 - r10
            java.lang.Object r7 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r7 = (com.badlogic.gdx.scenes.scene2d.Actor) r7
            float r7 = r7.getHeight()
            float r10 = r10 - r7
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 >= 0) goto L41
            r4 = 1
            goto L45
        L41:
            int r3 = r3 + (-1)
            goto L22
        L44:
            r10 = 0
        L45:
            if (r4 != 0) goto L8b
            float r10 = r9.getMaxY()
            goto L8b
        L4c:
            if (r10 >= 0) goto L8a
            float r10 = r9.getMaxY()
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L57
            goto L8a
        L57:
            if (r3 != r5) goto L5e
            float r10 = r9.getMaxY()
            goto L8b
        L5e:
            r10 = 0
        L5f:
            if (r10 >= r3) goto L82
            java.lang.Object r7 = r2.get(r10)
            com.badlogic.gdx.scenes.scene2d.Actor r7 = (com.badlogic.gdx.scenes.scene2d.Actor) r7
            float r7 = r7.getY()
            float r7 = r1 - r7
            java.lang.Object r8 = r2.get(r10)
            com.badlogic.gdx.scenes.scene2d.Actor r8 = (com.badlogic.gdx.scenes.scene2d.Actor) r8
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            int r8 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r8 <= 0) goto L7f
            r10 = r7
            r4 = 1
            goto L83
        L7f:
            int r10 = r10 + 1
            goto L5f
        L82:
            r10 = 0
        L83:
            if (r4 != 0) goto L8b
            float r10 = r9.getMaxY()
            goto L8b
        L8a:
            r10 = 0
        L8b:
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 >= 0) goto L90
            goto L9e
        L90:
            float r0 = r9.getMaxY()
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9d
            float r6 = r9.getMaxY()
            goto L9e
        L9d:
            r6 = r10
        L9e:
            r9.setScrollY(r6)
            return
    }

    public void jumpToSubmenuIndex(int r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2._table
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            if (r3 < 0) goto L39
            int r1 = r0.size
            if (r3 < r1) goto Ld
            goto L39
        Ld:
            java.lang.Object r3 = r0.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r3 = (com.badlogic.gdx.scenes.scene2d.Actor) r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2._table
            float r0 = r0.getHeight()
            float r1 = r3.getY()
            float r0 = r0 - r1
            float r3 = r3.getHeight()
            float r0 = r0 - r3
            r3 = 0
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2a
            r0 = 0
            goto L36
        L2a:
            float r3 = r2.getMaxY()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L36
            float r0 = r2.getMaxY()
        L36:
            r2.setScrollY(r0)
        L39:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell row() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.row()
            return r0
    }

    public void updateAllToolTables() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3._table
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L18
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r2
            r2.update()
            int r1 = r1 + (-1)
            goto La
        L18:
            return
    }
}
