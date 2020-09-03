/*
 * Autopsy
 *
 * Copyright 2020 Basis Technology Corp.
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
package org.sleuthkit.autopsy.discovery.ui;

import org.sleuthkit.autopsy.discovery.search.AbstractFilter;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SpinnerNumberModel;
import org.openide.util.NbBundle;
import org.sleuthkit.autopsy.communications.Utils;

/**
 * Filter panel for allowing the user to filter on date.
 */
class DateFilterPanel extends AbstractDiscoveryFilterPanel {

    private static final long serialVersionUID = 1L;
    private final SpinnerNumberModel numberModel;

    /**
     * Creates new form DateFilterPanel.
     */
    @NbBundle.Messages({"# {0} - timeZone",
        "DateFilterPanel.dateRange.text=Date Range ({0}):"})
    DateFilterPanel() {
        // numberModel is used in initComponents
        numberModel = new SpinnerNumberModel(10, 1, Integer.MAX_VALUE, 1);
        initComponents();
        rangeRadioButton.setText(Bundle.DateFilterPanel_dateRange_text(Utils.getUserPreferredZoneId().toString()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dateFilterCheckbox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        daysSpinner = new javax.swing.JSpinner(numberModel);
        daysLabel = new javax.swing.JLabel();
        mostRecentRadioButton = new javax.swing.JRadioButton();
        startCheckBox = new javax.swing.JCheckBox();
        startDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        endDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        endCheckBox = new javax.swing.JCheckBox();
        rangeRadioButton = new javax.swing.JRadioButton();

        org.openide.awt.Mnemonics.setLocalizedText(dateFilterCheckbox, org.openide.util.NbBundle.getMessage(DateFilterPanel.class, "DateFilterPanel.dateFilterCheckbox.text")); // NOI18N
        dateFilterCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFilterCheckboxActionPerformed(evt);
            }
        });

        daysSpinner.setEnabled(false);
        daysSpinner.setPreferredSize(new java.awt.Dimension(75, 26));
        daysSpinner.setValue(7);

        org.openide.awt.Mnemonics.setLocalizedText(daysLabel, org.openide.util.NbBundle.getMessage(DateFilterPanel.class, "DateFilterPanel.daysLabel.text")); // NOI18N
        daysLabel.setEnabled(false);

        buttonGroup1.add(mostRecentRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(mostRecentRadioButton, org.openide.util.NbBundle.getMessage(DateFilterPanel.class, "DateFilterPanel.mostRecentRadioButton.text")); // NOI18N
        mostRecentRadioButton.setEnabled(false);
        mostRecentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostRecentRadioButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(startCheckBox, org.openide.util.NbBundle.getMessage(DateFilterPanel.class, "DateFilterPanel.startCheckBox.text")); // NOI18N
        startCheckBox.setEnabled(false);
        startCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startCheckBoxStateChanged(evt);
            }
        });

        startDatePicker.setEnabled(false);
        startDatePicker.setMinimumSize(new java.awt.Dimension(60, 22));
        startDatePicker.setPreferredSize(new java.awt.Dimension(110, 22));

        endDatePicker.setEnabled(false);
        endDatePicker.setMinimumSize(new java.awt.Dimension(60, 22));
        endDatePicker.setPreferredSize(new java.awt.Dimension(110, 22));

        org.openide.awt.Mnemonics.setLocalizedText(endCheckBox, org.openide.util.NbBundle.getMessage(DateFilterPanel.class, "DateFilterPanel.endCheckBox.text")); // NOI18N
        endCheckBox.setEnabled(false);
        endCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                endCheckBoxStateChanged(evt);
            }
        });

        buttonGroup1.add(rangeRadioButton);
        rangeRadioButton.setEnabled(false);
        rangeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mostRecentRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(daysSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daysLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
            .addComponent(rangeRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endCheckBox)
                    .addComponent(startCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostRecentRadioButton)
                    .addComponent(daysSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rangeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startCheckBox)
                    .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endCheckBox)
                    .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_startCheckBoxStateChanged
        startDatePicker.setEnabled(startCheckBox.isSelected());
    }//GEN-LAST:event_startCheckBoxStateChanged

    private void endCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_endCheckBoxStateChanged
        endDatePicker.setEnabled(endCheckBox.isSelected());
    }//GEN-LAST:event_endCheckBoxStateChanged

    private void mostRecentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostRecentRadioButtonActionPerformed
        startCheckBox.setEnabled(false);
        endCheckBox.setEnabled(false);
        daysSpinner.setEnabled(true);
        daysLabel.setEnabled(true);
    }//GEN-LAST:event_mostRecentRadioButtonActionPerformed

    private void rangeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeRadioButtonActionPerformed
        startCheckBox.setEnabled(true);
        endCheckBox.setEnabled(true);
        daysSpinner.setEnabled(false);
        daysLabel.setEnabled(false);
    }//GEN-LAST:event_rangeRadioButtonActionPerformed

    private void dateFilterCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFilterCheckboxActionPerformed
        mostRecentRadioButton.setEnabled(dateFilterCheckbox.isSelected());
        rangeRadioButton.setEnabled(dateFilterCheckbox.isSelected());
    }//GEN-LAST:event_dateFilterCheckboxActionPerformed

    @Override
    void configurePanel(boolean selected, int[] indicesSelected) {
        dateFilterCheckbox.setSelected(selected);
        if (dateFilterCheckbox.isEnabled() && dateFilterCheckbox.isSelected()) {
            mostRecentRadioButton.setEnabled(true);
            rangeRadioButton.setEnabled(true);
            mostRecentRadioButton.setSelected(true);
        } else {
            mostRecentRadioButton.setEnabled(false);
            rangeRadioButton.setEnabled(false);
            daysLabel.setEnabled(false);
            daysSpinner.setEnabled(false);
            startCheckBox.setEnabled(false);
            endCheckBox.setEnabled(false);
            startDatePicker.setEnabled(false);
            endDatePicker.setEnabled(false);
        }
    }

    @Override
    JCheckBox getCheckbox() {
        return dateFilterCheckbox;
    }

    @Override
    JList<?> getList() {
        return null;
    }

    @Override
    JLabel getAdditionalLabel() {
        return null;
    }

    @Override
    String checkForError() {
        return "Domain search is not implemented.";
    }

    @Override
    AbstractFilter getFilter() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox dateFilterCheckbox;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JSpinner daysSpinner;
    private javax.swing.JCheckBox endCheckBox;
    private com.github.lgooddatepicker.components.DatePicker endDatePicker;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton mostRecentRadioButton;
    private javax.swing.JRadioButton rangeRadioButton;
    private javax.swing.JCheckBox startCheckBox;
    private com.github.lgooddatepicker.components.DatePicker startDatePicker;
    // End of variables declaration//GEN-END:variables
}
