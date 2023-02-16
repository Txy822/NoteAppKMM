//
//  HidableSearchTextField.swift
//  iosApp
//
//  Created by TESFAHUN on 16/02/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct HidableSearchTextField <Destination: View>:  View {
    
    var onSearchToggled : () -> Void
    var destinationprovider :() -> Destination
    var isSearchActive :Bool
    @Binding var searchText : String
    
    
    var body: some View {
        HStack {
            TextField("Search...", text: $searchText)
                .textFieldStyle(.roundedBorder)
                .opacity(isSearchActive ? 1 : 0)
            
            if(!isSearchActive){
                Spacer()
            }
            Button(action: onSearchToggled){
                Image(systemName: isSearchActive ? "xmark" : "magnifyingglass")
            }
            NavigationLink(destination : destinationprovider()){
                Image(systemName: "plus")
            }
        }
        
    }
}

struct HidableSearchTextField_Previews: PreviewProvider {
    static var previews: some View {
        HidableSearchTextField(
            onSearchToggled :{},
            destinationprovider: {EmptyView()},
            isSearchActive:true,
            searchText: .constant("You tube")
        )
    }
}
