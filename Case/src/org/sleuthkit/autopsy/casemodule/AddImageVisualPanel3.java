/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sleuthkit.autopsy.casemodule;

import javax.swing.JPanel;
import org.openide.util.Lookup;

/**
 * The "Add Image" wizard panel 3. This class is used to design the "form" of
 * the panel 3 for "Add Image" wizard panel.
 *
 * @author jantonius
 */
final class AddImageVisualPanel3 extends JPanel {

    /** Creates new form AddImageVisualPanel3 */
    AddImageVisualPanel3() {
        initComponents();
    }

    /**
     * Returns the name of the this panel. This name will be shown on the left
     * panel of the "Add Image" wizard panel.
     *
     * @return name  the name of this panel
     */
    @Override
    public String getName() {
        return "Done";
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addImgButton = new javax.swing.JButton();
        crDbLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(addImgButton, org.openide.util.NbBundle.getMessage(AddImageVisualPanel3.class, "AddImageVisualPanel3.addImgButton.text")); // NOI18N
        addImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImgButtonActionPerformed(evt);
            }
        });

        crDbLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(crDbLabel, org.openide.util.NbBundle.getMessage(AddImageVisualPanel3.class, "AddImageVisualPanel3.crDbLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddImageVisualPanel3.class, "AddImageVisualPanel3.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addImgButton)
                    .addComponent(crDbLabel)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crDbLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(addImgButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     *
     * @param evt  the action event
     */
    private void addImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImgButtonActionPerformed
        // restart the wizard
        AddImageAction act = Lookup.getDefault().lookup(AddImageAction.class);
        act.restart();
    }//GEN-LAST:event_addImgButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImgButton;
    private javax.swing.JLabel crDbLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
